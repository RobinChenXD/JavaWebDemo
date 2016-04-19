class Transform{
public:
    string trans(string str,int n){
      int i = 0,j = 0;
      string s;
      for(int t=0;t<str.size();t++){
        if(str[t]>='A'&&str[t]<='Z'){
          str[t]=str[t]-'A'+'a';
        }
        else if(str[t]>='a'&&str[t]<='z'){
          str[t]=str[t]-'a'+'A';
        }
      }
      reverse(str.begin(),str.end());
      for(int i=0;i<str.size();i++){
        if(str[i]==' '){
          reverse(str.begin()+j,str.begin()+i);
          j = i + 1;
        }
      }
      reverse(str.begin()+j,str.end());
      return str;
    }
};
