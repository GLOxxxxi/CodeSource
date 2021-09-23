package javaadvanced.lambda;

public class GetSumMessageImpl implements IGetSumMessage {
    private IGetSumMessage getSumMessage;

    public GetSumMessageImpl() {}

    public GetSumMessageImpl(IGetSumMessage getSumMessage) {
        this.getSumMessage = getSumMessage;
    }


    @Override
    public double getMessage(double a, double b) {
        return 0;
    }
}
