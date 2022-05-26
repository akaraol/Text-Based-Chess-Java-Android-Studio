package com.akaraol.bottomnavtestchess.Models;

public class ChessCommandLogModel {

    private Integer turn;
    private String move;


    public ChessCommandLogModel() {
    }

    public ChessCommandLogModel(Integer turn, String move) {
        this.turn = turn;
        this.move = move;
    }

    public Integer getTurn() {
        return turn;
    }

    public void setTurn(Integer turn) {
        this.turn = turn;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }
}
