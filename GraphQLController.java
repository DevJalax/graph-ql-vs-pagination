@RestController
@RequestMapping("/graphql")
public class GraphQLController {
    @Autowired
    private GraphQL graphQL;

    @PostMapping
    public GraphQLResponse executeGraphQLQuery(@RequestBody GraphQLRequest request) {
        ExecutionResult result = graphQL.execute(request.getQuery(), request.getVariables());
        return new GraphQLResponse(result.getGraphQLResult());
    }
}
