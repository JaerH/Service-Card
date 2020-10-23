package com.everis.card.services;

import com.everis.card.entities.Card;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ICardServiceImpl implements ICardService{

	@Override
	public List<Card> findByDni(Integer dni) {
		
		/*List<Card> cards = new ArrayList<Card>();
		cards.add(new Card("1111222233334441", true));
		cards.add(new Card("1111222233334442", true));
		cards.add(new Card("1111222233334443", true));
		cards.add(new Card("1111222233334444", false));
		cards.add(new Card("1111222233334445", false));
		cards.add(new Card("1111222233334446", false));*/
		List<Card> cards = Arrays.asList(
				new Card("1111222233334441", true),
				new Card("1111222233334442", true),
				new Card("1111222233334443", true),
				new Card("1111222233334444", false),
				new Card("1111222233334445", false), 
				new Card("1111222233334446", false)
				);
				
		return cards;
	}

}
