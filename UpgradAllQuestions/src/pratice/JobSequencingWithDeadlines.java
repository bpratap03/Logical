package pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JobSequencingWithDeadlines {
    public static void main(String[] args) {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("A", 100, 2));
        jobs.add(new Job("B", 19, 1));
        jobs.add(new Job("C", 27, 2));
        jobs.add(new Job("D", 25, 1));
        jobs.add(new Job("E", 15, 3));

        // D, B, A, C, E
        // 1- D
        // 2- A
        // 3- E

        // C-A-E

        System.out.println(maxProfitPossible(jobs));

    }

    private static int maxProfitPossible(List<Job> jobs) {
        // descending order of profit
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        int lastDeadline = 0;
        for(Job job: jobs) {
            lastDeadline = Math.max(job.deadline, lastDeadline);
        }

        Job[] timeSlots = new Job[lastDeadline + 1];

        int totalProfit = 0;
        for (Job job : jobs) {
            int deadline = job.deadline;
            while (timeSlots[deadline] != null && deadline > 0) {
                deadline--;
            }
            if(timeSlots[deadline] == null && deadline != 0) {
                timeSlots[deadline] = job;
                totalProfit += job.profit;
            }
        }
        return totalProfit;
    }
}

class Job {
    public String name;
    public int profit;
    public int deadline;

    public Job(String name, int profit, int deadline) {
        this.name = name;
        this.profit = profit;
        this.deadline = deadline;
    }
}