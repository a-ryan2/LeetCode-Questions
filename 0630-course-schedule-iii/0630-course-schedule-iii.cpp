bool comp(vector<int> a,vector<int> b)
{
    return a[1]<b[1];
}
class Solution {
public:
    int scheduleCourse(vector<vector<int>>& courses) {
        sort(courses.begin(), courses.end(), comp);
        priority_queue<int> PQ;
        int time = 0,i,n = courses.size();
        for(i = 0;i<n;++i)
        {
            vector<int> curr = courses[i];
            time += curr[0];
            PQ.push(curr[0]);
            if(time>curr[1])
            {
                time -= PQ.top();
                PQ.pop();
            }
        }
        return PQ.size();
    }
};