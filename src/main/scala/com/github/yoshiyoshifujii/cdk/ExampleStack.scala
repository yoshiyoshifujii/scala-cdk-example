package com.github.yoshiyoshifujii.cdk

import software.amazon.awscdk.core.{Construct, Stack, StackProps}
import software.amazon.awscdk.services.s3.{Bucket, BucketProps}

class ExampleStack(scope: Construct, name: String, props: StackProps = null)
    extends Stack(scope, name, props) {
  val bucket = new Bucket(
    this,
    "aws-cdk-scala-script-example-bucket",
    BucketProps
      .builder()
      .withBucketName("aws-cdk-scala-script-example-bucket")
      .build())
}
