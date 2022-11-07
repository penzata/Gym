package common;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Member {
    private final int id;

    public Member(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public List<Exercise> generateRoutine() {
        return IntStream.range(0, 6)
                .mapToObj(i -> new Exercise())
                .collect(Collectors.toList());
    }

    public void performRoutine() throws InterruptedException {
        List<Exercise> routine = generateRoutine();

        routine.forEach(exercise -> {
            System.out.println("startup.Gym common.Member " + this.getId() + " performing exercise: " + exercise);
            try {
                Thread.sleep(exercise.getDuration());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });
    }

}