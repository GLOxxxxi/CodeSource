package clazzcode.classcode0908.homework;

/**
 * 继承AbstractDoor,重写开关门,实现人脸识别接口IFaceRecognition
 */
public class AiDoor extends AbstractDoor implements IFaceRecognition{
    /**
     * 开门
     */
    @Override
    void openDoor() {
        // 判断是否通过人脸识别
        if (this.faceRecognition()) {
            System.out.println("通过开门");
        } else {
            System.out.println("识别未通过,请稍后再试");
        }

    }

    /**
     * 关门
     */
    @Override
    void closeDoor() {

        System.out.println("关门");
    }

    /**
     * 人脸识别结果
     * @return 识别是否成功
     */
    @Override
    public boolean faceRecognition() {
        return true;
    }
}
