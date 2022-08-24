

import java.util.Scanner;

public class Ex1
public static void main(String[] args) {
    for(int i=2;i<100;i++){
    int count=1;
    for(int j=2;j<i;j++){
    if(i%j ==0){
    count=0;
    break;
    }
    
    }if(count==1){
    System.out.println(i);
    
    }
    }
    
    
/* ILP506-Turma: Manhã -Nome:Raphaela Tuissi Ramos */
            
        