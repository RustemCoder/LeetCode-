#include <iostream>
#include <string>
using namespace std ;

class Solution {
public:
    int numberOfSteps (int num) {
        int k=0;
        while(num>0)
        {
              if(num%2==0)
              {
                  num =num/2;
                  k++;
              }
            else if( num%2!=0)
            {
                num = num-1;
                k++;
            }
        };
        
        return k ;
        
    }
};

int stringToInteger(string input) {
    return stoi(input);
}

int main() {
    string line;
    while (getline(cin, line)) {
        int num = stringToInteger(line);
        
        int ret = Solution().numberOfSteps (num);

        string out = to_string(ret);
        cout << out << endl;
    }
    return 0;
}