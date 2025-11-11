@Library('ci-lib@main') _
backendPipeline(
  mvnGoals: 'clean package -DskipTests',
  runTests: true,
  docker: true,                           // set to false if you don’t build images here
  registry: 'ghcr.io/your-org',          // e.g., ECR URL or GHCR
  image:    'backend-app',               // repo/image name
  tag:      "${env.BRANCH_NAME ?: 'latest'}".replaceAll('/','-'),
  dockerfile: 'Dockerfile',
  context: '.',
  buildArgs: [
    APP_VERSION: "${env.BUILD_NUMBER}"
  ],
  keepBuilds: '30'
)
