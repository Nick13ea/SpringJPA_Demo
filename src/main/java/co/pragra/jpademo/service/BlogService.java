package co.pragra.jpademo.service;

import co.pragra.jpademo.entity.Blog;
import co.pragra.jpademo.repo.BlogRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService {
    private BlogRepo repo;

    public BlogService(BlogRepo repo) {
        this.repo = repo;
    }

    public Blog createBlog(Blog blog) {
        //any validation
        return repo.save(blog);
    }

    public Blog updateBlog(Blog blog) {
        return repo.save(blog);
    }

    public List<Blog> getMeAll() {
        return repo.findAll();
    }

    public Optional<Blog> getbyId(Long id) {
        return repo.findById(id);
    }

    public void deleteAll() {
        repo.deleteAll();
    }
}
