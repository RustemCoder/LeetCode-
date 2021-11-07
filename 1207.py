class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        a = {}
        for el in arr:
            if el in a:
                a[el]+=1       
            else:
                a[el]=1
        listN = []
        for i in a.values():
            if i in listN:
                return False
            else:
                listN.append(i)
        return True
