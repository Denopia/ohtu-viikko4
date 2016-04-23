package ohtu;

public class TennisGame {

    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;
    private String[] scores = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName)) {
            m_score1 += 1;
        } else {
            m_score2 += 1;
        }
    }

    public String getScore() {
        if (gameOver())return winner();    
        if (m_score1 == m_score2) return evenScore();     
        if (over40()) return advantage();     
        return scores[m_score1] + "-" + scores[m_score2];

    }

    private String advantage() {
        if (m_score1 > m_score2)return "Advantage player1";
        return "Advantage player2";
    }

    private boolean over40() {
        return (m_score1 > 3 || m_score2 > 3);
    }

    private boolean gameOver() {
        return ((m_score1 > 3 || m_score2 > 3) && Math.abs(m_score1 - m_score2) > 1);
    }

    private String winner() {
        if (m_score1 > m_score2)return "Win for player1";
        return "Win for player2";
    }

    private String evenScore() {
        switch (m_score1) {
            case 0:return "Love-All";
            case 1:return "Fifteen-All";
            case 2:return "Thirty-All";
            case 3:return "Forty-All";
            default:return "Deuce";
        }
    }

}
