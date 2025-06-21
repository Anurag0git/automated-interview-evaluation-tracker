package model;

public class Feedback {
    private int feedbackId;
    private int candidateId;
    private String roundName;
    private String interviewer;
    private float rating;
    private String comments;
    private float weight;


    //constructor to insert, feedbackId auto-generated
    public Feedback(int candidateId, String roundName, String interviewer, float rating, String comments, float weight) {

        this.candidateId = candidateId;
        this.roundName = roundName;
        this.interviewer = interviewer;
        this.rating = rating;
        this.comments = comments;
        this.weight = weight;

    }

    //constructor with id, for fetching from db
    public Feedback(int feedbackId, int candidateId, String roundName, String interviewer, float rating, String comments, float weight) {
        this.feedbackId = feedbackId;
        this.candidateId = candidateId;
        this.roundName = roundName;
        this.interviewer = interviewer;
        this.rating = rating;
        this.comments = comments;
        this.weight = weight;
    }

    //getters and setters
    public int getFeedbackId() {
        return feedbackId;
    }
    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }
    public int getCandidateId() {
        return candidateId;
    }
    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }
    public String getRoundName() {
        return roundName;
    }
    public void setRoundName(String roundName) {
        this.roundName = roundName;
    }
    public String getInterviewer() {
        return interviewer;
    }
    public void setInterviewer(String interviewer) {
        this.interviewer = interviewer;
    }
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

}
