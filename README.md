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

