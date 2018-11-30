// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/build/build.proto

package io.grafeas.v1beta1.build;

public interface BuildSignatureOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.build.BuildSignature)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Public key of the builder which can be used to verify that the related
   * findings are valid and unchanged. If `key_type` is empty, this defaults
   * to PEM encoded public keys.
   * This field may be empty if `key_id` references an external key.
   * For Cloud Container Builder based signatures, this is a PEM encoded public
   * key. To verify the Cloud Container Builder signature, place the contents of
   * this field into a file (public.pem). The signature field is base64-decoded
   * into its binary representation in signature.bin, and the provenance bytes
   * from `BuildDetails` are base64-decoded into a binary representation in
   * signed.bin. OpenSSL can then verify the signature:
   * `openssl sha256 -verify public.pem -signature signature.bin signed.bin`
   * </pre>
   *
   * <code>string public_key = 1;</code>
   */
  java.lang.String getPublicKey();
  /**
   *
   *
   * <pre>
   * Public key of the builder which can be used to verify that the related
   * findings are valid and unchanged. If `key_type` is empty, this defaults
   * to PEM encoded public keys.
   * This field may be empty if `key_id` references an external key.
   * For Cloud Container Builder based signatures, this is a PEM encoded public
   * key. To verify the Cloud Container Builder signature, place the contents of
   * this field into a file (public.pem). The signature field is base64-decoded
   * into its binary representation in signature.bin, and the provenance bytes
   * from `BuildDetails` are base64-decoded into a binary representation in
   * signed.bin. OpenSSL can then verify the signature:
   * `openssl sha256 -verify public.pem -signature signature.bin signed.bin`
   * </pre>
   *
   * <code>string public_key = 1;</code>
   */
  com.google.protobuf.ByteString getPublicKeyBytes();

  /**
   *
   *
   * <pre>
   * Signature of the related `BuildProvenance`. In JSON, this is base-64
   * encoded.
   * </pre>
   *
   * <code>bytes signature = 2;</code>
   */
  com.google.protobuf.ByteString getSignature();

  /**
   *
   *
   * <pre>
   * An ID for the key used to sign. This could be either an Id for the key
   * stored in `public_key` (such as the Id or fingerprint for a PGP key, or the
   * CN for a cert), or a reference to an external key (such as a reference to a
   * key in Cloud Key Management Service).
   * </pre>
   *
   * <code>string key_id = 3;</code>
   */
  java.lang.String getKeyId();
  /**
   *
   *
   * <pre>
   * An ID for the key used to sign. This could be either an Id for the key
   * stored in `public_key` (such as the Id or fingerprint for a PGP key, or the
   * CN for a cert), or a reference to an external key (such as a reference to a
   * key in Cloud Key Management Service).
   * </pre>
   *
   * <code>string key_id = 3;</code>
   */
  com.google.protobuf.ByteString getKeyIdBytes();

  /**
   *
   *
   * <pre>
   * The type of the key, either stored in `public_key` or referenced in
   * `key_id`
   * </pre>
   *
   * <code>.grafeas.v1beta1.build.BuildSignature.KeyType key_type = 4;</code>
   */
  int getKeyTypeValue();
  /**
   *
   *
   * <pre>
   * The type of the key, either stored in `public_key` or referenced in
   * `key_id`
   * </pre>
   *
   * <code>.grafeas.v1beta1.build.BuildSignature.KeyType key_type = 4;</code>
   */
  io.grafeas.v1beta1.build.BuildSignature.KeyType getKeyType();
}
