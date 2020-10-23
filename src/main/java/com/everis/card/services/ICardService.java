package com.everis.card.services;

import com.everis.card.entities.Card;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;

public interface ICardService {
	
	public List<Card> findByDni(@RequestBody Integer dni);

}
