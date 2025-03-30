package DesignPatterns.Prototypes.sol3;

/**
 * Created By Ravi on 28-04-2023
 **/
public class IntelligentStudent extends Student {
    int iq;

    public IntelligentStudent(IntelligentStudent other) {
        super(other);
        this.iq = other.iq;
    }

    @Override
    public Student copy() {
        return new IntelligentStudent(this);
    }
}
