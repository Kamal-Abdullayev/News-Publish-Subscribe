package com.newspubsub.news;

import com.newspubsub.news.model.News;
import com.newspubsub.news.model.NewsTopicsEnum;
import com.newspubsub.news.model.User;
import com.newspubsub.news.repository.NewsRepository;
import com.newspubsub.news.repository.NewsSubscriptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@SpringBootApplication
public class NewsApplication implements CommandLineRunner {
	private final NewsSubscriptionRepository subscriptionRepository;
	private final NewsRepository newsRepository;

	public static void main(String[] args) {
		SpringApplication.run(NewsApplication.class, args);
	}

	@Override
	public void run(String... args) {
		User user = new User("Sincere", "Trujillo", String.valueOf(System.currentTimeMillis()),"name.surname@gmail.com", true,
				List.of(NewsTopicsEnum.LOCAL, NewsTopicsEnum.WORLD, NewsTopicsEnum.ECONOMY, NewsTopicsEnum.SPORT));
		User user2 = new User("Cyrus ", "Roach", String.valueOf(System.currentTimeMillis()),"name2.surname2@gmail.com",true,
				List.of(NewsTopicsEnum.POLITIC, NewsTopicsEnum.TRAVEL, NewsTopicsEnum.HEALTH, NewsTopicsEnum.SPORT));
		User user3 = new User("Louie", "Petersen", String.valueOf(System.currentTimeMillis()),"name3.surname3@gmail.com",false,
				new ArrayList<>());
		subscriptionRepository.save(user);
		subscriptionRepository.save(user2);
		subscriptionRepository.save(user3);

		News news = new News("What is Lorem Ipsum?",
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
				List.of(NewsTopicsEnum.LOCAL, NewsTopicsEnum.WORLD, NewsTopicsEnum.ECONOMY, NewsTopicsEnum.SPORT));
		News news2 = new News("Why do we use it?",
				"It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout",
				List.of(NewsTopicsEnum.POLITIC, NewsTopicsEnum.TRAVEL, NewsTopicsEnum.HEALTH, NewsTopicsEnum.SPORT));
		News news3 = new News("Where does it come from?",
				"Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old.",
				List.of(NewsTopicsEnum.POLITIC));
		newsRepository.save(news);
		newsRepository.save(news2);
		newsRepository.save(news3);
	}
}
