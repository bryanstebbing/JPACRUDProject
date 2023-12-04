package com.skilldistillery.archerygear.data;


import java.util.List;

import com.skilldistillery.archerygear.entities.Bow;

public interface BowDAO {
	Bow findByInt(int bowId);
	List<Bow> findAll();
	Bow create(Bow bow);
	Bow update(int bowInt, Bow bow);
	boolean deleteById(int bowId);
}
