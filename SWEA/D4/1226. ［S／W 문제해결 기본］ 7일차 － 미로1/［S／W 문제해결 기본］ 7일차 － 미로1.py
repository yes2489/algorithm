for i in range(1, 11):

    n = int(input())
    arr = [list(map(int, input())) for _ in range(16)]
    ans = 0

    def dfs(r, c):
        global ans
        arr[r][c] = 1

        dr, dc = [-1, 1, 0, 0], [0, 0, -1, 1]
        for i in range(4):
            nr = r + dr[i]
            nc = c + dc[i]

            if arr[nr][nc] == 3:
                ans = 1
                return

            if 0 <= nr < 16 and 0 <= nc < 16 and arr[nr][nc] == 0:
                arr[nr][nc] = 1
                dfs(nr, nc)


    dfs(1, 1)
    print(f"#{n} {1 if ans else 0}")