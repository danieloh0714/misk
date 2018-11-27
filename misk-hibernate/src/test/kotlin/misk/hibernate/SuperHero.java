// Code generated by Wire protocol buffer compiler, do not edit.
// Source
/*
* message SuperHero {
*   optional string super_hero_name = 1;
*   optional string civilian_name = 2;
*
*   message SuperPower {
*     optional string name = 1;
*     optional uint32 strength = 2;
*   }
*   repeated SuperPower powers =3 ;
* }
*/
package misk.hibernate;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

public final class SuperHero extends Message<SuperHero, SuperHero.Builder> {
  public static final ProtoAdapter<SuperHero> ADAPTER = new ProtoAdapter_SuperHero();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_SUPER_HERO_NAME = "";

  public static final String DEFAULT_CIVILIAN_NAME = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String super_hero_name;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String civilian_name;

  @WireField(
      tag = 3,
      adapter = "misk.hibernate.SuperHero$SuperPower#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<SuperPower> powers;

  public SuperHero(String super_hero_name, String civilian_name, List<SuperPower> powers) {
    this(super_hero_name, civilian_name, powers, ByteString.EMPTY);
  }

  public SuperHero(String super_hero_name, String civilian_name, List<SuperPower> powers,
      ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.super_hero_name = super_hero_name;
    this.civilian_name = civilian_name;
    this.powers = Internal.immutableCopyOf("powers", powers);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.super_hero_name = super_hero_name;
    builder.civilian_name = civilian_name;
    builder.powers = Internal.copyOf("powers", powers);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SuperHero)) return false;
    SuperHero o = (SuperHero) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(super_hero_name, o.super_hero_name)
        && Internal.equals(civilian_name, o.civilian_name)
        && powers.equals(o.powers);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (super_hero_name != null ? super_hero_name.hashCode() : 0);
      result = result * 37 + (civilian_name != null ? civilian_name.hashCode() : 0);
      result = result * 37 + powers.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (super_hero_name != null) builder.append(", super_hero_name=").append(super_hero_name);
    if (civilian_name != null) builder.append(", civilian_name=").append(civilian_name);
    if (!powers.isEmpty()) builder.append(", powers=").append(powers);
    return builder.replace(0, 2, "SuperHero{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<SuperHero, Builder> {
    public String super_hero_name;

    public String civilian_name;

    public List<SuperPower> powers;

    public Builder() {
      powers = Internal.newMutableList();
    }

    public Builder super_hero_name(String super_hero_name) {
      this.super_hero_name = super_hero_name;
      return this;
    }

    public Builder civilian_name(String civilian_name) {
      this.civilian_name = civilian_name;
      return this;
    }

    public Builder powers(List<SuperPower> powers) {
      Internal.checkElementsNotNull(powers);
      this.powers = powers;
      return this;
    }

    @Override
    public SuperHero build() {
      return new SuperHero(super_hero_name, civilian_name, powers, super.buildUnknownFields());
    }
  }

  public static final class SuperPower extends Message<SuperPower, SuperPower.Builder> {
    public static final ProtoAdapter<SuperPower> ADAPTER = new ProtoAdapter_SuperPower();

    private static final long serialVersionUID = 0L;

    public static final String DEFAULT_NAME = "";

    public static final Integer DEFAULT_STRENGTH = 0;

    @WireField(
        tag = 1,
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
    )
    public final String name;

    @WireField(
        tag = 2,
        adapter = "com.squareup.wire.ProtoAdapter#UINT32"
    )
    public final Integer strength;

    public SuperPower(String name, Integer strength) {
      this(name, strength, ByteString.EMPTY);
    }

    public SuperPower(String name, Integer strength, ByteString unknownFields) {
      super(ADAPTER, unknownFields);
      this.name = name;
      this.strength = strength;
    }

    @Override
    public Builder newBuilder() {
      Builder builder = new Builder();
      builder.name = name;
      builder.strength = strength;
      builder.addUnknownFields(unknownFields());
      return builder;
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof SuperPower)) return false;
      SuperPower o = (SuperPower) other;
      return unknownFields().equals(o.unknownFields())
          && Internal.equals(name, o.name)
          && Internal.equals(strength, o.strength);
    }

    @Override
    public int hashCode() {
      int result = super.hashCode;
      if (result == 0) {
        result = unknownFields().hashCode();
        result = result * 37 + (name != null ? name.hashCode() : 0);
        result = result * 37 + (strength != null ? strength.hashCode() : 0);
        super.hashCode = result;
      }
      return result;
    }

    @Override
    public String toString() {
      StringBuilder builder = new StringBuilder();
      if (name != null) builder.append(", name=").append(name);
      if (strength != null) builder.append(", strength=").append(strength);
      return builder.replace(0, 2, "SuperPower{").append('}').toString();
    }

    public static final class Builder extends Message.Builder<SuperPower, Builder> {
      public String name;

      public Integer strength;

      public Builder() {
      }

      public Builder name(String name) {
        this.name = name;
        return this;
      }

      public Builder strength(Integer strength) {
        this.strength = strength;
        return this;
      }

      @Override
      public SuperPower build() {
        return new SuperPower(name, strength, super.buildUnknownFields());
      }
    }

    private static final class ProtoAdapter_SuperPower extends ProtoAdapter<SuperPower> {
      public ProtoAdapter_SuperPower() {
        super(FieldEncoding.LENGTH_DELIMITED, SuperPower.class);
      }

      @Override
      public int encodedSize(SuperPower value) {
        return ProtoAdapter.STRING.encodedSizeWithTag(1, value.name)
            + ProtoAdapter.UINT32.encodedSizeWithTag(2, value.strength)
            + value.unknownFields().size();
      }

      @Override
      public void encode(ProtoWriter writer, SuperPower value) throws IOException {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name);
        ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.strength);
        writer.writeBytes(value.unknownFields());
      }

      @Override
      public SuperPower decode(ProtoReader reader) throws IOException {
        Builder builder = new Builder();
        long token = reader.beginMessage();
        for (int tag; (tag = reader.nextTag()) != -1;) {
          switch (tag) {
            case 1: builder.name(ProtoAdapter.STRING.decode(reader)); break;
            case 2: builder.strength(ProtoAdapter.UINT32.decode(reader)); break;
            default: {
              FieldEncoding fieldEncoding = reader.peekFieldEncoding();
              Object value = fieldEncoding.rawProtoAdapter().decode(reader);
              builder.addUnknownField(tag, fieldEncoding, value);
            }
          }
        }
        reader.endMessage(token);
        return builder.build();
      }

      @Override
      public SuperPower redact(SuperPower value) {
        Builder builder = value.newBuilder();
        builder.clearUnknownFields();
        return builder.build();
      }
    }
  }

  private static final class ProtoAdapter_SuperHero extends ProtoAdapter<SuperHero> {
    public ProtoAdapter_SuperHero() {
      super(FieldEncoding.LENGTH_DELIMITED, SuperHero.class);
    }

    @Override
    public int encodedSize(SuperHero value) {
      return ProtoAdapter.STRING.encodedSizeWithTag(1, value.super_hero_name)
          + ProtoAdapter.STRING.encodedSizeWithTag(2, value.civilian_name)
          + SuperPower.ADAPTER.asRepeated().encodedSizeWithTag(3, value.powers)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, SuperHero value) throws IOException {
      ProtoAdapter.STRING.encodeWithTag(writer, 1, value.super_hero_name);
      ProtoAdapter.STRING.encodeWithTag(writer, 2, value.civilian_name);
      SuperPower.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.powers);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public SuperHero decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.super_hero_name(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.civilian_name(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.powers.add(SuperPower.ADAPTER.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public SuperHero redact(SuperHero value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.powers, SuperPower.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}