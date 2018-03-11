#include<iostream>
#include<string>
using namespace std;
string encode(string s)
{
	string res;
	int j;
	char arr[][20] = {"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
	int len = s.length();
	for(int i=0;i<len;i++)
	{
		j = int(s.at(i));
		//For upper case use mode 65
		j = j%97;
		res.append(arr[j]);
	}
	return res;
}

int main()
{
	string s,res;
	cin>>s;
	res = encode(s);
	cout<<res<<endl;
	return 0;
}
