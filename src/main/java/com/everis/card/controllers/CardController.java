package com.everis.card.controllers;

import com.everis.card.entities.Card;
import com.everis.card.services.ICardService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

	@Autowired
	private ICardService iCardService;

	@GetMapping("/core/cards/{dni}")
	public List<Card> listCards(@PathVariable Integer dni) {
		return iCardService.findByDni(dni);
	}

}
