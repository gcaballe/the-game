package com.kronostudios.the_game.core;

import com.kronostudios.the_game.models.Build;
import com.kronostudios.the_game.models.Card;
import com.kronostudios.the_game.models.User;

import java.util.List;

public class UserIG extends User{
    private Build build;
    private List<Card> hand;
    private DeckIG deck;


    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public List<Card> draw(){
        if(hand.size() < 3){
            while (hand.size()<3){
                if(deck.getCards().size() == 0){
                    deck.refillDeck();
                }
                deck.shuffle();
                Card draw = deck.topDeck();
                hand.add(draw);
            }
        }
        return hand;
    }

    public void useCard(Card c){
        hand.remove(c);
        deck.getCardsDrawn().add(c);
    }
}
