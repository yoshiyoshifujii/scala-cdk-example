# scala-cdk-example

## Install of AWS CDK

```sh
$ npm install -g aws-cdk
```

## CDK

```sh
$ cdk ls
[info] Loading project definition from $WORKSPACE/scala-cdk-example/project
[info] Loading settings for project root from build.sbt ...
[info] Set current project to scala-cdk-example (in build file:$WORKSPACE/scala-cdk-example/)
[info] Running com.github.yoshiyoshifujii.cdk.Main
[success] Total time: 1 s, completed yyyy/MM/dd HH:mm:ss
example-stack

$ cdk deploy
...
example-stack: deploying...
example-stack: creating CloudFormation changeset...
 0/3 | HH:mm:ss | CREATE_IN_PROGRESS   | AWS::S3::Bucket    | aws-cdk-scala-script-example-bucket (awscdkscalascriptexamplebucketXXXXXXXXX)
 0/3 | HH:mm:ss | CREATE_IN_PROGRESS   | AWS::CDK::Metadata | CDKMetadata
 0/3 | HH:mm:ss | CREATE_IN_PROGRESS   | AWS::S3::Bucket    | aws-cdk-scala-script-example-bucket (awscdkscalascriptexamplebucketXXXXXXXXX) Resource creation Initiated
 0/3 | HH:mm:ss | CREATE_IN_PROGRESS   | AWS::CDK::Metadata | CDKMetadata Resource creation Initiated
 1/3 | HH:mm:ss | CREATE_COMPLETE      | AWS::CDK::Metadata | CDKMetadata
 2/3 | HH:mm:ss | CREATE_COMPLETE      | AWS::S3::Bucket    | aws-cdk-scala-script-example-bucket (awscdkscalascriptexamplebucketXXXXXXXXX)
 3/3 | HH:mm:ss | CREATE_COMPLETE      | AWS::CloudFormation::Stack | example-stack

 ✅  example-stack

Stack ARN:
arn:aws:cloudformation:<AWS_REGION>:<AWS_ACCOUNTID>:stack/example-stack/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx

$ cdk destroy
...
Are you sure you want to delete: example-stack (y/n)? y
example-stack: destroying...

 ✅  example-stack: destroyed
```
