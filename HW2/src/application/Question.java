package application;

public class Question {
	private int id;
    private String text;
    private String answer;

    public Question(int id, String text, String answer) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Question text cannot be empty.");
        }
        if (answer == null || answer.isEmpty()) {
            throw new IllegalArgumentException("Answer cannot be empty.");
        }
        this.id = id;
        this.text = text;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Question text cannot be empty.");
        }
        this.text = text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        if (answer == null || answer.isEmpty()) {
            throw new IllegalArgumentException("Answer cannot be empty.");
        }
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question ID: " + id + " | " + text + " | Answer: " + answer;
    }
}

