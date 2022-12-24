package lab13.task5;

public class PhoneNumber {
    private String givenNumber;

    public PhoneNumber(String givenNumber){
        this.givenNumber = givenNumber;
    }

    public String toString(){
        if (givenNumber.startsWith("+")){
            return "+" + givenNumber.substring(1, 5) + "-" + givenNumber.substring(5, 8)
                    + "-" + givenNumber.substring(8);
        }
        else {
            return "+" + givenNumber.substring(0, 4) + "-" + givenNumber.substring(4, 7) + "-"
                    + givenNumber.substring(7);
        }
    }
}
