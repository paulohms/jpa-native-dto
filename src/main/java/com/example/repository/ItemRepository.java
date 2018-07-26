package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.model.Item;
import com.example.model.ItemSummary;

public interface ItemRepository extends JpaRepository<Item, Long> {

	@Query(name="findExampleToDTO")
	ItemSummary getItemSummary(@Param("id") String id);

}
