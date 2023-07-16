class Solution(object):
    def smallestSufficientTeam(self, req_skills, people):
        """
        :type req_skills: List[str]
        :type people: List[List[str]]
        :rtype: List[int]
        """
        skill_dict = {v: i for i, v in enumerate(req_skills)}
        dp = {0: []}
        for i, person in enumerate(people):
            his_skill = 0
            for skill in person:
                if skill in skill_dict:
                    his_skill |= 1 << skill_dict[skill]
            keys = list(dp.keys())
            for skill_set, team in dp.items():
                with_him = skill_set | his_skill
                if with_him == skill_set: continue
                if with_him not in dp or len(dp[with_him]) > len(team) + 1:
                    dp[with_him] = team + [i]
        return dp[(1 << len(req_skills)) - 1]
        