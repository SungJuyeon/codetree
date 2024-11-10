const input = require('fs').readFileSync(0, 'utf-8').split('\n');
const [n, m] = input[0].split(' ').map(Number);

const graph = Array.from({ length: n + 1 }, () => []);

for (let i = 1; i <= m; i++) {
    const [x, y] = input[i].split(' ').map(Number);
    graph[x].push(y);
    graph[y].push(x);
}

const visited = Array(n + 1).fill(false);

function DFS(vertex) {
    visited[vertex] = true;
    let count = 1;

    for (let i = 0; i < graph[vertex].length; i++) {
        const currV = graph[vertex][i];
        if (!visited[currV]) {
            count += DFS(currV);
        }
    }

    return count;
}

const num = DFS(1);
console.log(num - 1);