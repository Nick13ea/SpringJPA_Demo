package co.pragra.jpademo;

import co.pragra.jpademo.entity.Blog;
import co.pragra.jpademo.entity.Category;
import co.pragra.jpademo.service.BlogService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.Instant;

@SpringBootApplication
public class JpaDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(JpaDemoApplication.class, args);
        BlogService blogService = context.getBean(BlogService.class);

        Blog blog = new Blog();
        blog.setTitle("Learning Java");
        blog.setBlogText("Learning lambdas are confusing");
        Category category = new Category();
        category.setName("Programming");
        category.setCreateDate(Instant.now());
        category.setUpdateDate(Instant.now());
        blog.setCategory(category);
        blog.setCreateDate(Instant.now());
        blogService.createBlog(blog);

    }

}
