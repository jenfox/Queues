package com.amex.demo.endpoints;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amex.demo.queues.MyQueue;

@RestController
public class QueueController {

	@GetMapping("/double")
	public ResponseEntity<String> doubleQueue() {

		MyQueue q = new MyQueue();
		ArrayList<String> tmp = new ArrayList<>();
		tmp.add("asdf");
		tmp.add("asdf");
		tmp.add("asdf");
		tmp.add("asdf");

		q.addAll(tmp);

		return ResponseEntity.ok("Good to go!");
	}

}
