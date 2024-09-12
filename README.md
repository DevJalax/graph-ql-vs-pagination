# graph-ql-vs-jpa-pagination

## Benchmarks

dataset size =  10,000 records.
assumptions : well-indexed database and a reasonable database connection , page size of 20 records and a relatively simple projection
well-optimized GraphQL schema and a reasonable dataset size 

1) JPA 

- findAll() : 500-700 ms

- findAllProjected(pageable) : 150-250 ms

2) GraphQL 

- Find all data : 300-500 ms

- Find only that particular data : 100-200 ms


## Difference between Cursor based pagination (GraphQL) vs Index based pagination (JPA pagination)


| Feature                     | Cursor-Based Pagination                              | Index-Based Pagination                             |
|-----------------------------|-----------------------------------------------------|---------------------------------------------------|
| Pagination Method            | Uses a unique cursor to track the last item retrieved | Uses a numerical offset to track the last item retrieved |
| Query Efficiency             | Efficient, skips over already retrieved items       | Inefficient, fetches all items up to the offset   |
| Real-time Data              | Suitable for real-time data                          | Not suitable for real-time data                    |
| Implementation Complexity    | Complex, requires cursor management                  | Simple, easy to implement                          |
| Client-side Management       | Requires cursor management on the client-side       | Requires offset management on the client-side      |

## Use cases 

1) Use cursor-based pagination when:
- You're dealing with large datasets.
- You need to handle real-time data.
- You want to optimize performance.

2) Use index-based pagination when:
- You're dealing with small to medium-sized datasets.
- You need a simple pagination solution.
You don't need to handle real-time data.
