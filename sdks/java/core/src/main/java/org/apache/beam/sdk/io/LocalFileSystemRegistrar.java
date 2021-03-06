/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.beam.sdk.io;

import com.google.auto.service.AutoService;
import javax.annotation.Nullable;
import org.apache.beam.sdk.options.PipelineOptions;

/**
 * {@link AutoService} registrar for the {@link FileSystem}.
 */
@AutoService(FileSystemRegistrar.class)
public class LocalFileSystemRegistrar implements FileSystemRegistrar {

  static final String LOCAL_FILE_SCHEME = "file";

  @Override
  public FileSystem fromOptions(@Nullable PipelineOptions options) {
    return new LocalFileSystem();
  }

  @Override
  public String getScheme() {
    return LOCAL_FILE_SCHEME;
  }
}
