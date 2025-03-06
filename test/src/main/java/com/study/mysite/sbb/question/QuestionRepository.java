package com.study.mysite.sbb.question;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface QuestionRepository extends JpaRepository<Question, Integer>{
	Question findBySubject(String subject);
	Question findBySubjectAndContent(String subject, String content);
	List<Question> findBySubjectLike(String subject);
	
	Page<Question> findAll(Pageable pageable);
	Page<Question> findAll(Specification<Question> spec, Pageable pageable);
	
	/*
	@Query("select distinct q from Question q left outer join SiteUser u1 on q.author=u1 left join Answer a on a.question=q left join SiteUser u2 on a.author=u2 where q.subject like %:kw% or q.content like %:kw% or a.content like %:kw% or u2.username like %:kw%")
	Page<Question> findAllByKeyword(@Param("kw") String kw, Pageable pageable);
	*/
	
	// QuestionRepository.java

	

	// native-true-01)네이티브 쿼리에서 Pageable을 사용하여 페이지네이션 처리 =>QuestionService
	
	/*
	 h2 콘솔에서 먼저 테스트 해볼 것!
	 	SELECT q.* 
		FROM question AS q 
		LEFT JOIN site_user AS su1 ON q.author_id = su1.id 
		LEFT JOIN answer AS a ON a.question_id = q.id 
		LEFT JOIN site_user AS su2 ON a.author_id = su2.id 
		WHERE q.subject LIKE '%테스트%' 
		   OR q.content LIKE '%테스트%' 
		   OR a.content LIKE '%테스트%' 
		   OR su2.username LIKE '%테스트%' 
		ORDER BY q.create_date DESC
	 */
	
	@Query(value = "SELECT q.* FROM question as q " +
            "LEFT JOIN site_user as su1 ON q.author_id = su1.id " +
            "LEFT JOIN answer a ON a.question_id = q.id " +
            "LEFT JOIN site_user as su2 ON a.author_id = su2.id " +
            "WHERE q.subject LIKE %:kw% "
            + "OR q.content LIKE %:kw% "
            + "OR a.content LIKE %:kw% "
            + "OR su2.username LIKE %:kw% " +
            "ORDER BY q.create_date DESC", 
            //countQuery는 Pageable을 사용하여 데이터를 페이징 처리할 때, 전체 페이지 수를 계산하는 데 필요한 총 데이터 개수를 조회합니다. countQuery를 사용하여 전체 데이터 개수를 구하는 쿼리를 명시해 주어야 합니다.findAll() 또는 페이징 관련 쿼리를 사용할 때, JPA는 자동으로 데이터의 개수를 계산하려 시도합니다. 하지만 조인과 같이 복잡한 쿼리에서는 전체 데이터의 개수를 계산할 수 없기 때문에 countQuery를 명시적으로 추가해줘야 합니다.
    countQuery = "SELECT COUNT(q.id) FROM question q " +
                 "LEFT JOIN site_user su1 ON q.author_id = su1.id " +
                 "LEFT JOIN answer a ON a.question_id = q.id " +
                 "LEFT JOIN site_user su2 ON a.author_id = su2.id " +
                 "WHERE q.subject LIKE %:kw% OR q.content LIKE %:kw% OR a.content LIKE %:kw% OR su2.username LIKE %:kw%",
    nativeQuery = true)
	Page<Question> findAllByKeyword(@Param("kw") String kw, Pageable pageable);




	









}
