
#include <iostream>
#include <vector>
#include <string>
using namespace std ;
class Solution {
public:
    vector <int> sumZero(int n) 
    {
    vector <int> array(n);
     if(n%2==0 && n>1)
        
     {
         
         for(int i=0;i<n;i=i+2)
         {
             array[i]=i+1;
             array[i+1]=-(i+1);
         }
     }
        else if(n%2!=0 && n>1)
        {
        
           for(int i=1;i<n;i=i+2)
           {
               array[0]=0;
            array[i]=i;
            array[i+1]=-i;
           }
              
        }
        else if(n==1)
                {
                 for(int i=0;i<n;i++)
{
                     array[i]=0;
}   
                }
        return array ;
    }
    
 
};

int stringToInteger(string input) {
    return stoi(input);
}

string integerVectorToString(vector<int> list, int length = -1) {
    if (length == -1) {
        length = list.size();
    }

    if (length == 0) {
        return "[]";
    }

    string result;
    for(int index = 0; index < length; index++) {
        int number = list[index];
        result += to_string(number) + ", ";
    }
    return "[" + result.substr(0, result.length() - 2) + "]";
}

int main() {
    string line;
    while (getline(cin, line)) {
        int n = stringToInteger(line);
        
        vector<int> ret = Solution().sumZero(n);

        string out = integerVectorToString(ret);
        cout << out << endl;
    }
    return 0;
}