package model;

import java.util.ArrayList;

/**
 * The overall game object.
 */
public class CatanModel {

    /**
     * Bank controls all of the available resources.
     */
    private Bank bank;

    /**
     * List of messages for in game chat functionality.
     */
    private Chat chat;

    /**
     * List of messages for logging changes in the game.
     */
    private Log log;

    /**
     * CatanMap object that controls the game's map.
     */
    private CatanMap map;

    /**
     * List of players in the game.
     */
    private ArrayList<Player> players;

    /**
     * Controls a trade offer between two players.
     */
    private TradeOffer tradeOffer;

    /**
     * Keeps track of which player's turn it is by index.
     */
    private TurnTracker turnTracker;

    /**
     * Version of the game. Increments everytime there is a change to the CatanModel.
     */
    private int version;

    /**
     * Index of a player who is the winner of the CatanModel.
     */
    private int winner;

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public CatanMap getMap() {
        return map;
    }

    public void setMap(CatanMap map) {
        this.map = map;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public TradeOffer getTradeOffer() {
        return tradeOffer;
    }

    public void setTradeOffer(TradeOffer tradeOffer) {
        this.tradeOffer = tradeOffer;
    }

    public TurnTracker getTurnTracker() {
        return turnTracker;
    }

    public void setTurnTracker(TurnTracker turnTracker) {
        this.turnTracker = turnTracker;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    /**
     * Increments the version of the game whenever there are changes to the game.
     */
    public void incrVersion() {
        version++;
    }

}
