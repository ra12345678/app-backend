@Library('jenkins-shared-lib@main') _
mavenJarPipeline(
  artifactsBucket: 'java-artifacts-us-east-1',
  appName: 'app-backend',
  deploy: true,                         // auto-disabled on PRs
  smokeUrl: '',                         // e.g., 'http://10.0.0.5:8080/health' (optional)
  notifySlackOnSuccess: false,
  notifySlackOnFailure: false
)
