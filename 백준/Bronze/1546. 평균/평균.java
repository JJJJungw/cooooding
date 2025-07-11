import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
        //최대값을 골라 모든 점수는 점수 / 최대점수 * 100
        int subject = Integer.parseInt(br.readLine());
        String[] grade = br.readLine().split(" ");
        float[] gradenum = new float[subject];
        float max_grade = Float.MIN_VALUE;
        float answer = 0;

        for(int i = 0; i < grade.length; i++){
            gradenum[i] = Integer.parseInt(grade[i]);
            max_grade=Math.max(max_grade,gradenum[i]);
        }
        for(int i = 0; i <subject; i++){
            gradenum[i] = gradenum[i]/max_grade*100;
            answer += gradenum[i];
        }
        answer=answer/subject;
        System.out.println(answer);

        
        


    }
    
}
