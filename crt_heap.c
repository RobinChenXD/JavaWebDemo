void   crt_heap(RecordType r[], int length )
/*�Լ�¼����r���ѣ�lengthΪ����ĳ���*/
{
	int i,n;
              n= length;
	for ( i=n/2; i >= 1; --i)         /* �Ե�[n/2]����¼��ʼ����ɸѡ���� */ 
                  sift(r,i,n);
}