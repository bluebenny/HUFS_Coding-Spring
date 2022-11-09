# include <stdio.h>

int main() {
	int A[5];
	int B[5];
	int ans[10];
	int i;
	int j=0;
	int k = 5;

	//																printf("A 집합의 원소 5개 입력: ");
	
	for (i = 0; i < 5; i++)
		scanf("%d", &A[i]);
	
	//																printf("B 집합의 원소 5개 입력: ");
	for (i = 0; i < 5; i++)
		scanf("%d", &B[i]);

	for (i = 0; i < 5; i++)
	{
		ans[i] = A[i];
	}

	for (j = 0; j < 5; j++)
	{
		for (i = 0; i < 5; i++)
		{
			if (B[j] == A[i])
				break;

			if (i == 4)
			{
				ans[k] = B[j];
				k++;
			}
		}
	}

	//																printf("A와 B의 합집합: ");
	
	for (i = 0;i < k; i++)
		printf("%d ", ans[i]);

	printf("\n");

	return 0;
}


