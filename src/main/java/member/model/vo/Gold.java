package member.model.vo;

public class Gold extends Member {
    public Gold(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public double calculateInterest() {
        return super.getPoint() * 0.05;
    }
}
