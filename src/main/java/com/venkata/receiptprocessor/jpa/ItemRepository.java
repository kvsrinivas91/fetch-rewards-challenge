package com.venkata.receiptprocessor.jpa;

import com.venkata.receiptprocessor.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ItemRepository is a repository class for the Item
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, String> {
}
