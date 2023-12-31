package jpagoorm.postcrudapi.repository;

import jakarta.persistence.EntityManager;
import jpagoorm.postcrudapi.domain.Comment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CommentRepository {

    private final EntityManager em;

    public void save(Comment comment) {
        em.persist(comment);
    }

    public Comment findById(Long commentId) {
        return em.find(Comment.class, commentId);
    }
}
