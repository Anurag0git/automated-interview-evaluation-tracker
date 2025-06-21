package model;

public class Candidate {
    private int candidateId;
    private String name;
    private String email;
    private String position;



    public Candidate(String name, String email, String position){
        this.name = name;
        this.email = email;
        this.position = position;

    }

    public Candidate(int candidateId, String name, String email, String position){
        this.candidateId = candidateId;
        this.name = name;
        this.email = email;
        this.position = position;
    }

    public int getCandidateId(){
        return candidateId;
    }

    public void setCandidateId(int candidateId){
        this.candidateId = candidateId;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

}
