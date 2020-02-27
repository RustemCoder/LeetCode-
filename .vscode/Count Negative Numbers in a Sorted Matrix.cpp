#include <iostream>
#include <vector>
using namespace std ;
class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
    int k = 0;    
        
    
        for(int i=0;i<grid.size();i++)
        {
          for(int j=0;j<grid[i].size();j++)
          {
              if(grid[i][j]<0)
              {
k++;}
          }
        }
        
        
        return k ;
    }
};

int main()
{
    int n,m;
cin>>n>>m;
    vector <vector<int>> A(n,vector<int>(m));
   int ret = Solution().countNegatives(A);

return 0 ;

}