// 최종코드+주석
#include <stdio.h>

int main() {
    char string[200] = {0};
    int count = 0;
    printf("알파벳을 입력하세요: \n");
    gets(string);  //문자열 입력받기
    for(int i=0; i<200; i++){ 
        if( string[i]>=97 && string[i]<=122){ //소문자 a~z이면
            if(string[i] == 100 && string[i+1]==122 && string[i+2]==61){ //dz=일때
                i=i+2; //d만 읽고 나머지는 for문 pass
                count++; //하나의 문자로 취급
                printf("3");
            }else if(string[i]==108 && string[i+1] == 106 || string[i] == 110 && string[i+1] ==106){
                //lj, nj 일때 i를 하나 증가, count도 하나만 증가
                i = i+1; //i를 증가시켜 두개의 문자로 계산되는 것을 방지
                count++; //for문이 다시 실행되면 j다음 문자로 넘어가므로 바로 count가 증가해야함
                printf("-1");
            }else{ //그외의 문자라면 그냥 count 증가
                count++;
                printf("1");
            }
        }//소문자 a~z이면 종료
        printf("0"); //소문자 이외의 다른 문자라면 0을 출력해라 count도 증가하지 않는다
    }
    printf("이 단어는 %d개의 알파벳으로 이루어져 있습니다.", count); //결과 출력

    return 0;
}