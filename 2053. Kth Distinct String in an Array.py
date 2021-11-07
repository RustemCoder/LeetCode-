from collections import OrderedDict
class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        newDict = OrderedDict()
        for el in arr:
            if el in newDict:
                newDict[el]+=1
            else:
                newDict[el]=1
        
        Func = lambda dictN: [key for key,value in dictN.items() if(value<2)]
        try:
            return Func(newDict)[k-1]
        except:
            return ""
        
