package learn.spring.springboot.domain;

public class User {
    private int id;
    private int userId;
    private int score;

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public User setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public int getScore() {
        return score;
    }

    public User setScore(int score) {
        this.score = score;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", userId=" + userId +
            ", score=" + score +
            '}';
    }
}
