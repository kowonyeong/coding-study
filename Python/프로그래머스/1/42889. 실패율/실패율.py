def solution(N, stages):
    count = [0] * (N + 2)

    for stage in stages:
        count[stage] += 1

    result = []
    total = len(stages)

    for i in range(1, N + 1):
        if total == 0:
            failure = 0
        else:
            failure = count[i] / total

        result.append((i, failure))
        total -= count[i]

    result.sort(key=lambda x: (-x[1], x[0]))

    return [x[0] for x in result]